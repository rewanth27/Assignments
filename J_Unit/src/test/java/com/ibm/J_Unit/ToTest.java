package com.ibm.J_Unit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ToTest {
     
    @BeforeAll
	public static void beforeAll()
	{
		System.out.println("Before All....");
	}
	
    @AfterAll
	public static void afterAll()
	{
		System.out.println("After All.........");
	}
	
    @BeforeEach
	public void beforeEach()
	{
		System.out.println("Before each..");
	}
	
    @AfterEach
	public void afterEach()
	{
		System.out.println("After each Test.....");
	}
	
    @Test
	public void test1()
	{
		System.out.println("Testing 1.....");
	}
    
    @Test
    public void test2()
    {
    	System.out.println("Testing 2.......");
    }
	
    @Disabled
    public void disable()
    {
    	System.out.println("Disabled");
    }
	
   @DisplayName(value = "Name")
    public void displayName()
    {
    	System.out.println("Name");
    }
}
