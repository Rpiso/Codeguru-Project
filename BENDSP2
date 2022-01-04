
/* package codechef; // don't place package name! */

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int cakes = Integer.parseInt(reader.readLine());
		long oddHeights = 0;
		long evenHeights = 0;
				
		String[] cakeHeightsIn = reader.readLine().split(" ");
		for(int i=0; i<cakes;i++) {
			if(i%2==0) oddHeights = oddHeights + Long.parseLong(cakeHeightsIn[i]);
			else evenHeights = evenHeights + Long.parseLong(cakeHeightsIn[i]);
		}
		int tasks = Integer.parseInt(reader.readLine());
		for(int n=0;n<tasks;n++) {
			String[] tasksDetail = reader.readLine().split(" ");
			int task = Integer.parseInt(tasksDetail[0]);
			if(task == 1) {
				int start = Integer.parseInt(tasksDetail[1]);
				int end = Integer.parseInt(tasksDetail[2]);
				long heightToAdd = Long.parseLong(tasksDetail[3]);
				int delta = end-start+1;
				if(start % 2 == 0) {
					/*Es. 1 2 8 10 -- delta = 7, 4 even heights, 3 odd heights  */
					int oddHeightBetween = delta / 2;
					oddHeights = oddHeights + (heightToAdd*oddHeightBetween);
					int evenHeightBetween = delta - oddHeightBetween;
					evenHeights = evenHeights + (heightToAdd*evenHeightBetween);
				}
				else {
					/*Es. 1 3 8 10 -- delta = 6, 3 even heights, 3 odd heights  */
					int evenHeightBetween = delta / 2;
					evenHeights = evenHeights + (heightToAdd*evenHeightBetween);
					int oddHeightBetween = delta - evenHeightBetween;
					oddHeights = oddHeights + (heightToAdd*oddHeightBetween);
				}
			}
			else if(task == 2) System.out.println(oddHeights);
			else if(task == 3) System.out.println(evenHeights);
		}
	}
}
