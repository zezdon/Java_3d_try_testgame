package testfront.level;

public class Block {
	
	public boolean solid = false;
	
	public static Block solidWall = new SolidBlock();
	public static Block nonsolidWall = new NonSolidWall();

}
