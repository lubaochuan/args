import org.junit.Test;
import static org.junit.Assert.*;

public class ArgsTest {
  @Test
  public void testOneBooleanPresent() throws Exception {
    Args args = new Args("x", new String[]{"-x"});
    assertEquals(true, args.isValid());
    assertEquals(true, args.getBoolean('x'));
  }

  @Test
  public void testTwoBooleanPresent() throws Exception {
    Args args = new Args("x,y", new String[]{"-x -y"});
    assertEquals(true, args.isValid());
    assertEquals(true, args.getBoolean('x'));
    assertEquals(true, args.getBoolean('y'));
  }
}