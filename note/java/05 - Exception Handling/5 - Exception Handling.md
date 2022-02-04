Exception

Checked Exception: Has to be try-catched or decleared using throws keyword on method.
UnChecked Exception: Don't need to be try-catched or decleared.
Throwable is the parent class of all exceptions and errors.
 
Exception Handling
class AntraUserNotFoundException extends Exception { // this is an checked exception
 }
class Test {
  public void doSomething() throws AntraUserNotFoundException { // declear. otherwise error in compilation.
    throw new AntraUserNotFoundException();
 }

  public void doSomethingElse() {
     try {
       doSomething(); // because doSomething throws, so here to catch. otherwise error.
     }catch(AntraUserNotFoundException ex) {}
  }}
// If we create an unchecked exception, then no need to declear or try-catchclass AntraUserNotFoundExeption extends RuntimeException{} // this is unchecked exception
public void doSomething(){
    throw new AntraUserNotFoundException();}

 
Try-catch-finally
Multiple catch blocks can be put after a try block.
Finally block is optional.
Try-Finally block is also valid. No catch block.
https://www.youtube.com/watch?v=dq8A1PVQDRE
