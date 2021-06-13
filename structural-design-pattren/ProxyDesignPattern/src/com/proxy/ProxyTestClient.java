package com.proxy;

interface DatabaseExecutator{
	void executeDatabaseQuery(String query) throws Exception;
}

class DatabaseExecutatorImplementation implements DatabaseExecutator{

	@Override
	public void executeDatabaseQuery(String query) {
		System.out.println("Going to execute query : "+query);
	}
	
}

class DatabaseExecutatorProxy implements DatabaseExecutator{
	
	Boolean isAdmin=false;
	DatabaseExecutatorImplementation databaseExecutatorImplementation;
	
	public DatabaseExecutatorProxy(String name,String password) {
		if(name=="Admin" && password=="faiz@123") {
			isAdmin=true;
			databaseExecutatorImplementation=new DatabaseExecutatorImplementation();
		}
	}

	@Override
	public void executeDatabaseQuery(String query) throws Exception {
		if(isAdmin) {
			databaseExecutatorImplementation.executeDatabaseQuery(query);
		}
		else {
			if(query.equals("DELETE") || query.equals("delete")) {
				throw new Exception("Delete is not allowd by non-admin user");
			}
			else {
				databaseExecutatorImplementation.executeDatabaseQuery(query);
			}
		}
	}
	
}

public class ProxyTestClient {

	public static void main(String[] args) {
		try {
			DatabaseExecutator nonAdminExecutator=new DatabaseExecutatorProxy("non-admin", "faiz@123");
			nonAdminExecutator.executeDatabaseQuery("delete");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			DatabaseExecutator adminExecutator=new DatabaseExecutatorProxy("Admin", "faiz@123");
			adminExecutator.executeDatabaseQuery("DELETE");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
