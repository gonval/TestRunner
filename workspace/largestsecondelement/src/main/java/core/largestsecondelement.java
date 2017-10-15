package core;




		class MainClass
		{
		    int secondLargest(int[] input)
		    {
		        int firstLargest, secondLargest;

		        //Checking first two elements of input array

		        if(input[0] > input[1])
		        {
		            //If first element is greater than second element

		            firstLargest = input[0];

		            secondLargest = input[1];
		        }
		        else
		        {
		            //If second element is greater than first element

		            firstLargest = input[1];

		            secondLargest = input[0];
		        }

		        //Checking remaining elements of input array

		        for (int i = 2; i < input.length; i++)
		        {
		            if(input[i] > firstLargest)
		            {
		                //If element at 'i' is greater than 'firstLargest'

		                secondLargest = firstLargest;

		                firstLargest = input[i];
		            }
		            else if (input[i] < firstLargest && input[i] > secondLargest)
		            {
		                //If element at 'i' is smaller than 'firstLargest' and greater than 'secondLargest'

		                secondLargest = input[i];
		            }
		        }

		        return secondLargest;
		    }
	}

