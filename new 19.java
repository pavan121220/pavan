/**
 * 
 */
package com.highradius.payrad.templateCreation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author kumar.ankit
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		case 1		
		String[] mainArray =  {"4", "3", "2", "1", "0"};
// case2		
		String[] mainArray2 = {"4", "5", "3", "2", "1"};
		try {
		
			int order = 0;
			String[] tempMainArray = new  String[mainArray.length];
			for(int index = 0; index <mainArray.length; index++) {
				 order = Integer.valueOf(mainArray[index]);
				 tempMainArray[order] = mainArray[index];
			}
			
			for(int index = 0; index <mainArray.length; index++) {
				System.out.println(tempMainArray[index]);
			}
		
			// case 2 
			
			String[] tempMainArray2 = new  String[mainArray2.length];
			for(int index = 0; index <mainArray2.length; index++) {
				 order = Integer.valueOf(mainArray2[index]) -1;
				 tempMainArray2[order] = mainArray2[index];
			}
			mainArray2 = tempMainArray2;
			for(int index = 0; index <mainArray2.length; index++) {
				System.out.println(mainArray2[index]);
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
