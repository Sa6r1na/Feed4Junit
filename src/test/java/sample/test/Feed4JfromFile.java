package sample.test;

import org.databene.benerator.anno.Source;
import org.databene.feed4junit.Feeder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import sample.code.UserAccess;


@RunWith(Feeder.class) //Specify the class will be ran as Feeder class
public class Feed4JfromFile {

     //Specify the method as a test method
    @Source("Data.csv")//Specify the input data source
    @Test
    public void testAccessCheck_CSV(String userName,String pw,boolean expected) {
        Assert.assertEquals(expected, UserAccess.accessCheck(userName,pw));
    }
}