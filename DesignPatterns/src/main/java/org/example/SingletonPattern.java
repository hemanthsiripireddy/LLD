package org.example;

public class SingletonPattern {

    static void testSingleton(){

        Connection connection1=Connection.getInstance();

        System.out.println("---------------");
        Connection connection2=Connection.getInstance();

        if(connection2==connection1)
            System.out.println("singleton passed");
        else
            System.out.println("singleton failed");

    }
}


class Connection{
    private  static Connection connection;

    private Connection(){

    }

    public static Connection getInstance(){
        if(connection==null){
            synchronized (Connection.class){

                if(connection==null)
                    connection=new Connection();

            }

        }
        return connection;
    }
}
