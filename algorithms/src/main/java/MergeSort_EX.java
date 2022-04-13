package com.demo;

//Java code to explain double check locking
public class MergeSort_EX
{
	// private instance, so that it can be
	// accessed by only by getInstance() method
	private static MergeSort instance;

	private MergeSort()
	{
		// private constructor
	}

	public static MergeSort getInstance()
	{
		if (instance == null)
		{
			//synchronized block to remove overhead
			synchronized (MergeSort.class)
			{
				if(instance==null)
				{
					// if instance is null, initialize
					instance = new MergeSort();
				}

			}
		}
		return instance;
	}
}
