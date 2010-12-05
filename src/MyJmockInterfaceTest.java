import junit.framework.TestCase;
import org.jmock.Mockery;
import org.jmock.Expectations;


public class MyJmockInterfaceTest extends TestCase {




	    Mockery context = new Mockery();

	    public void testOneSubscriberReceivesAMessage() {
	        // set up
	        final MyJmockInterface astring = context.mock(MyJmockInterface.class);

	        Stringrep myString = new Stringrep();
	        myString.add(astring);
	        
	        final String message = "This is My String";
	        
	        // expectations
	        context.checking(new Expectations() {{
	            oneOf (astring).receive(message);
	        }});

	        // execute
	        myString.publish(message);
	        
	        // verify
	        context.assertIsSatisfied();
	    }
	}
	
	
	
	
	
	
	
	
	


