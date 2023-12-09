public class facultyTeamNode {
    private Faculty faculty;
    private facultyTeamNode leftChild;
    private facultyTeamNode middleChild;
    private facultyTeamNode RightChild;
    private facultyTeamNode Parent;
    private playerInTeam[] players;
    private int points;
    boolean isLeaf=isLeaf();

    public facultyTeamNode() {

    }

    public facultyTeamNode(Faculty faculty){
        this.faculty=faculty;
        this.players = new playerInTeam[11];

    }
    public facultyTeamNode(Faculty faculty, facultyTeamNode parent) {
        this.faculty=faculty;
        this.Parent = parent;
        this.players = new playerInTeam[11];
    }

    public int getKey(){
        return this.faculty.getId();
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setKey(int id){
        if (this.faculty==null){
            this.faculty=new Faculty(id,null);
        }
        this.faculty.setId(id);
    }
    public boolean addPlayerToTeam(Player P){
        for (int i=0; i<11;i++){
            if (this.players[i]==null){
                this.players[i]=new playerInTeam(P);
                return true;
            }
        }
        return false;
    }

    public void removePlayerFromTeam(Player P){
        for (int i=0; i<11;i++){
            if (players[i]!=null && players[i].getPlayer().getId()==P.getId()){
                players[i]= null;
            }
        }
    }

    public void IncreaseGoals(int playerId){
        for (int i=0; i<11;i++){
            if (this.players[i]!=null&&this.players[i].getPlayer().getId()==playerId){
                int goals= this.players[i].getGoals();
                this.players[i].setGoals(goals+1);
            }
        }
    }


    public void getTopScorerInTeam(Player P){
        int max = 0;
        int maxId = 0;
        String maxName=null;

        for (int i=0; i<11;i++){
            if(this.players[i]!=null){
                if (this.players[i].getGoals()> max||(players[i].getGoals() == max &&
                        (players[i].getPlayer().getId()<maxId) ||maxId==0)){//maxId==0 -In case all the players have 0 goals
                    max = players[i].getGoals();
                    maxId = players[i].getPlayer().getId();
                    maxName=players[i].getPlayer().getName();
                }
            }
        }
        P.setId(maxId);
        P.setName(maxName);
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public facultyTeamNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(facultyTeamNode leftChild) {
        this.leftChild = leftChild;
    }

    public facultyTeamNode getMiddleChild() {
        return middleChild;
    }

    public void setMiddleChild(facultyTeamNode middleChild) {
        this.middleChild = middleChild;
    }

    public facultyTeamNode getRightChild() {
        return RightChild;
    }

    public void setRightChild(facultyTeamNode rightChild) {
        RightChild = rightChild;
    }

    public facultyTeamNode getParent() {
        return Parent;
    }

    public void setParent(facultyTeamNode parent) {
        Parent = parent;
    }

    public playerInTeam[] getPlayers() {
        return players;
    }

    public void setPlayers(playerInTeam[] players) {
        this.players = players;
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

