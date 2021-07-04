package org.harish.core.java.generic;

/**
 * 
 * @author Harish Kumar
 *
 * public class BoundedGenericClassDemo<T extends Integer> :
 *   --> compile time error : The type parameter T should not be bounded by the final type Integer. 
 *      Final types cannot be further extended
 *   Similarly for public class BoundedGenericClassDemo<T extends String>
 *       -->  The type parameter T should not be bounded by the final type String.
 *           Final types cannot be further extended
 *  But for this :
 *   public class BoundedGenericClassDemo<T extends Number>    
 *       --> This is correct. We can pass either Number or its child class as parameter.
 *       
 *  class Test<T extends X>:
 *    Here X is non-final class or interface.
 *    
 *         
 *       
 */


public class BoundedGenericClassDemo<T extends Number>{
	

}
