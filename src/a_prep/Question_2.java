package a_prep;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Question_2 {
    
	 private boolean[] visited;
	    private boolean[] importantServers;
	    private int[] serverIDs;
	    private int[] groupID;
	    private int globalID;
	    private int serverConnections;
	    private ArrayList<LinkedList<Integer>> paths;
	    
	    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	    List<Integer> criticalRouters(int numRouters, int numLinks, 
		                              ArrayList<ArrayList<Integer>> links)
	    {
	            initGraph(numRouters, numLinks, links);
	            
	            for (int i = 0; i < numRouters; i++) {
	                if (!visited[i]) {
	                    serverConnections = 0;
	                    findImportantServers(i ,i, -1);
	                    importantServers[i] = serverConnections > 1;
	                }
	            }
	            
	            
	            ArrayList<Integer> critical = new ArrayList<Integer>();
	            for(int i = 0 ; i < importantServers.length; i++) {
	                if (importantServers[i]) {
	                    critical.add(i);
	                }
	                
	            }
	            
	            
	            return critical;
	    }
	    
	    private void initGraph(int numRouters, int numLinks, ArrayList<ArrayList<Integer>> links) {
	        globalID = 0;
	        serverConnections = 0;
	        visited =           new boolean[numRouters];
	        serverIDs =                new int[numRouters];
	        groupID =           new int[numRouters];
	        importantServers = new boolean[numRouters];
	        paths = new ArrayList<LinkedList<Integer>>();


	        for (int i = 0 ; i < numLinks; i++ ) {
	            paths.add(new LinkedList<Integer>());
	        }    

	        for(List<Integer> link : links) {
	            paths.get(link.get(0)).add(link.get(1));
	            paths.get(link.get(1)).add(link.get(0));
	            
	        }
	    }
	    
	    private void findImportantServers (int rootRouter, int currentRouter, int previousRouter) {
	        // discover/explore router
	        visited[currentRouter] = true;
	        serverIDs[currentRouter] = globalID;
	        groupID[currentRouter] = globalID;
	        globalID++;
	            
	        if (previousRouter == rootRouter)
	            serverConnections++;
	            
	        for (int nextRouter : paths.get(currentRouter)) {
	            if (nextRouter != previousRouter) {
	                
	                if (visited[nextRouter]) {
	                    
	                    groupID[currentRouter] = Math.min(groupID[currentRouter], serverIDs[nextRouter]);
	                    
	                } else {
	                    
	                    // DFS routers
	                    findImportantServers(rootRouter, nextRouter, currentRouter);
	                    
	                    groupID[currentRouter] = Math.min(groupID[currentRouter], serverIDs[nextRouter]);
	                    
	                    
	                    if (serverIDs[currentRouter] <= groupID[nextRouter]) {
	                        importantServers[currentRouter] = true;
	                    }
	                }
	            }
	        }
	    }
}