package com.demo;

//Java code to explain double check locking
public class LinkedListEx
{
	// private instance, so that it can be
	// accessed by only by getInstance() method
	private static LinkedListEx instance;

	private LinkedListEx()
	{
		// private constructor
	}

	public static LinkedListEx getInstance()
	{
		if (instance == null)
		{
			//synchronized block to remove overhead
			synchronized (LinkedListEx.class)
			{
				if(instance==null)
				{
					// if instance is null, initialize
					instance = new LinkedListEx();
				}

			}
		}
		return instance;
	}
}