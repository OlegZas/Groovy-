//Like with insert, we'll make the update within a function so we can call it here.

def updateUser(userId, name, username, email){

    def sql = DBConnectionUtil.getDatabaseConneciton()

    try {
    //check that the userId belongs to an existing user
        def userToUpdate = sql.firstRow(
                "SELECT * FROM USERS WHERE user_id = ? ", [userId])
        //"If userToUpdate is null, then the user doesn't exists - throw and exception
        // In groovy, a null value is 'falsy' which means it can be used in place of the boolean false
        if(!userToUpdate){// same as if userToUpdate = null
            throw new IllegalArgumentException("user with Id ${userId} doesn't exists")
        }

        println("Updating user id ${userId}")

        sql.executeUpdate('''
    
    UPDATE users 
    SET name = ?, username = ?, email = ? 
    WHERE user_id = ? 

''', [name, username, email, userId ])

        println "User with ID ${userId} update successfully."
    } catch (Exception e){
        println "Erorr updating user ${e.message}"
    }finally {
        sql.close()
    }
}

//call the method
updateUser(8,'UPDATE2', 'oz124', 'oz@gmail.com')

def deleteUser(userId){

    //1. establish connection to the DB
    def sql = DBConnectionUtil.getDatabaseConneciton()

    try {

        def deleteTheUser = sql.firstRow("SELECT * FROM users where user_id = ?", [userId])

        sql.executeUpdate('''
        DELETE FROM users
        WHERE user_id = ?
        ''',[userId])

        def usernameStored = deleteTheUser?.username // ? is not mandatory, but can be used to avoid nullpointerexcptn in case username is null.
        // it's called "safe operator" in groovy

        println "Oh no, user is deleted $usernameStored"
    }catch (Exception e){
        println "Failed to delete ${e.message}"
    } finally {
        sql.close()
    }
}

//calling mehtod

deleteUser(14)
