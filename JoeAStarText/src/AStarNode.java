/**
 * 
 * The nodes that represent the basis of A* pathfinding
 * @author Joseph Satterfield
 *
 */

public class AStarNode {
	
	//Can the node be used
	private boolean passable;
	
	//The cost to move along a edge
	private int edgeCost;
	
	//The cost to move along a corner
	private int cornerCost;
	
	//The x coordinate of the node
	private int xCoord;
	
	//The y coordinate of the node
	private int yCoord;
	
	/**
	 * Creates a pathfinding node based on given data
	 * @param passable If the node is available for movement
	 * @param edgeCost The cost to move along an edge
	 * @param cornerCost The cost to move along a corner
	 * @param xCoord The x position of the node
	 * @param yCoord The y coordination of the node
	 */
	public AStarNode(boolean passable, int edgeCost, int cornerCost, int xCoord, int yCoord)
	{
		this.passable = passable;
		this.edgeCost = edgeCost;
		this.cornerCost = cornerCost;
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}

	public boolean isPassable() {
		return passable;
	}

	public void setPassable(boolean passable) {
		this.passable = passable;
	}

	public int getEdgeCost() {
		return edgeCost;
	}

	public void setEdgeCost(int edgeCost) {
		this.edgeCost = edgeCost;
	}

	public int getCornerCost() {
		return cornerCost;
	}

	public void setCornerCost(int cornerCost) {
		this.cornerCost = cornerCost;
	}

	public int getxCoord() {
		return xCoord;
	}

	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}

	public int getyCoord() {
		return yCoord;
	}

	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}
	
	@Override
	public String toString()
	{
		return ("[" + getxCoord() + ", " + getyCoord() + "]");
	}
}
