// Last updated: 03. 05. 2025. 14:45:18
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int oranges=0;
        int rotten=0;
        int mins=0;
        boolean poss=false;
        // 1st: count all oranges, store position of the rotten one to queue for BFS.
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j]==1 || grid[i][j]==2){
                    oranges++;
                }
                if (grid[i][j]==2){
                    poss=true;
                    q.add(new int[]{i,j});
                }
            }
        }
        System.out.println(q);
        //if no oranges at all, return 0
        if(oranges==0)
            return 0;
        if(!poss)
            return -1;
        // BFS 
        while(!q.isEmpty() && rotten<oranges){
            int size=q.size();
            // incr. rotten in each iteration
            rotten += size;
            if(rotten==oranges)
                return mins;
            mins++;
            for(int i = 0; i<size; i++){
                int[] position = q.peek();
                if(position[0]+1<grid.length && grid[position[0]+1][position[1]]==1){
                    grid[position[0]+1][position[1]]=2;
                    q.add(new int[]{position[0]+1, position[1]});
                }
                if(position[0]-1>=0 && grid[position[0]-1][position[1]]==1){
                    grid[position[0]-1][position[1]]=2;
                    q.add(new int[]{position[0]-1, position[1]});
                }
                if(position[1]+1<grid[0].length && grid[position[0]][position[1]+1]==1){
                    grid[position[0]][position[1]+1]=2;
                    q.add(new int[]{position[0], position[1]+1});
                }
                if(position[1]-1>=0 && grid[position[0]][position[1]-1]==1){
                    grid[position[0]][position[1]-1]=2;
                    q.add(new int[]{position[0], position[1]-1});
                }
                q.poll();
            }
        }
        return -1;
    }
}