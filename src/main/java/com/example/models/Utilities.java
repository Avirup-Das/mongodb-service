package com.example.models;

import java.util.Random;

public class Utilities 
{
	public static String getId(String name)
	{
		int id = 100000 + new Random().nextInt(900000);
		return (name.isEmpty()) ? "ANON"+ id : name.substring(0, 2).toUpperCase() + id;			
	}
}