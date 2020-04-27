import java.io.*;

public class ObjectOutputStreamNoCabecera extends ObjectOutputStream 
{ 
  	public ObjectOutputStreamNoCabecera(OutputStream out) throws IOException 
  	{ 
    	super(out); 
    } 
    
  	protected void writeStreamHeader() throws IOException { } 
}