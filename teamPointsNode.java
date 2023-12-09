public class teamPointsNode {
        private int points;
        private Faculty faculty;
        private teamPointsNode leftChild;
        private teamPointsNode middleChild;
        private teamPointsNode RightChild;
        private teamPointsNode Parent;
        private teamPointsNode MaxNode;
        private teamPointsNode Successor;
        public teamPointsNode Predecessor;
        boolean isLeaf=isLeaf();

    public teamPointsNode() {
    }

    public teamPointsNode(int points, Faculty faculty, teamPointsNode parent) {
        this.points = points;
        this.faculty = faculty;
        Parent = parent;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getKey() {
            return this.faculty.getId();
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public teamPointsNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(teamPointsNode leftChild) {
        this.leftChild = leftChild;
    }

    public teamPointsNode getMiddleChild() {
        return middleChild;
    }

    public void setMiddleChild(teamPointsNode middleChild) {
        this.middleChild = middleChild;
    }

    public teamPointsNode getRightChild() {
        return RightChild;
    }

    public void setRightChild(teamPointsNode rightChild) {
        RightChild = rightChild;
    }

    public teamPointsNode getParent() {
        return Parent;
    }

    public void setParent(teamPointsNode parent) {
        Parent = parent;
    }

    public teamPointsNode getMaxNode() {
        return this.MaxNode;
    }

    public void setMaxNode(teamPointsNode maxNode) {
        this.MaxNode= maxNode;
    }

    public teamPointsNode getSuccessor() {
        return Successor;
    }

    public void setSuccessor(teamPointsNode successor) {
        Successor = successor;
    }

    public teamPointsNode getPredecessor() {
        return Predecessor;
    }

    public void setPredecessor(teamPointsNode predecessor) {
        Predecessor = predecessor;
    }

    public void setKey(int id, int points) {
        if (this.faculty==null){
            this.faculty=new Faculty(id, null);
            this.points = points;
        }
        else {
            this.faculty.setId(id);
            this.points = points;
        }
    }

    public boolean isLeaf() {
        if(this.getLeftChild()==null){
            this.isLeaf = true;
            return true;
        }
        this.isLeaf = false;
        return false;
    }
}
