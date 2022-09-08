// Declare complete package statement. 
package com.scientecheasy.state.cityinfo; 
public class Dhanbad 
{ 
 public void stateInfo() 
  { 
    System.out.println("Dhanbad is the first major city of Jharkhand"); 
  } 
public void cityInfo()
{ 
    System.out.println("Dhanbad city is called coal capital city of India."); 
 } 
} 
// Declare complete package statement for TCS. 
   package com.tcs.state.requiredinfo; 

// Import the package with class name. 
    import com.scientecheasy.state.cityinfo.dhanbad; 
    class Tcs
    { 
     public static void main(String[] args)
     { 
       Dhanbad d = new Dhanbad(); 
        d.stateinfo(); 
        d.cityinfo(); 
     } 
}