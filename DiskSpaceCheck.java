//
//	  File:  DiskSpaceCheck.java
//    Purpose:  Check disk space on Linux file space
//
//	  History
//    Date 		Author			Remarks
/	  20151125	T. Esposito		original version
//

import java.io.File;

public class DiskSpaceCheck
{
    public static void main(String[] args)
        {
    	File file = new File("/");
	   	long totalSpace = file.getTotalSpace(); //total disk space in bytes.
	   	long usableSpace = file.getUsableSpace(); ///unallocated / free disk space in bytes.
	   	long freeSpace = file.getFreeSpace(); //unallocated / free disk space in bytes.

        System.out.println("Total size : " + totalSpace /1024 /1024 + " MB");
		System.out.println("Space free : " + usableSpace /1024 /1024 + " MB");
		System.out.println("Space free : " + freeSpace /1024 /1024 + " MB");
	    }
}
