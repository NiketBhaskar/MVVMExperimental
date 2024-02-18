package com.revia.mvvmexperimental.model

class Service {
    fun login(userName : String, userPass: String, listner: (AuthListner) -> Unit){
        if(userName == "admin" && userPass == "admin"){
            listner(AuthListner(true, "Success"))
        }
        else{
            listner(AuthListner(false, "Failure"))
        }
    }
}