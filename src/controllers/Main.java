package controllers;

import java.util.ArrayList;
import java.util.List;

import models.User;

public class Main {

	public static void main(String[] args)
	{
		List<User> users = new ArrayList<User>();
		users.add(new User("Bart", "Simpson", "bart@simpson.com", "secret"));
		users.add(new User("Homer", "Simpson", "homer@simpson.com", "secret"));
		users.add(new User("Lisa", "Simpson", "lisa@simpson.com", "secret"));
		System.out.println(users);
	}
}
