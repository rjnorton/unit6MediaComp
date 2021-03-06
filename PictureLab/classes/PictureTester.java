/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void textCopyWithEnd()
  {
      Picture beach = new Picture("beach.jpg");
      Picture temple = new Picture("temple.jpg");
      beach.explore();
      beach.copy(temple,40,400,40,400);
      temple.copy(beach,40,400,40,400);
      temple.explore();
  }
  
  public static void testSepia()
  {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.greyscale();
      beach.explore();
      beach.sepia();
      beach.explore();
  }
  
  public static void testPosterize()
  {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.posterize();
      beach.explore();
  }
  
  public static void testNegate()
  {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.negate();
      beach.explore();
  }
  
  public static void testGreyscale()
  {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.greyscale();
      beach.explore();
  }
  
  public static void fixUnderwaterTester()
  {
      Picture water = new Picture("water.jpg");
      water.explore();
      water.fixUnderwater();
      water.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorDiagonal()
  {
      Picture gorge = new Picture("beach.jpg");
      gorge.explore();
      gorge.mirrorDiagonal();
      gorge.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      caterpillar.mirrorVerticalRightToLeft();
      caterpillar.explore();
  }
  
  public static void testMirrorHorizontal()
  {
      Picture temple = new Picture("gorge.jpg");
      temple.explore();
      temple.mirrorHorizontal();
      temple.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testMyCollage()
  {
      Picture canvas = new Picture(1200,1200);
      canvas.createMyCollage();
      canvas.explore();
      canvas.write("MyCollage.jpg");
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}