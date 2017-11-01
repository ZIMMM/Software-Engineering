package com.sanfoundry.hardgraph;

import java.util.HashMap;
import java.util.*;


class GraphLinkedList
{
	 
	    
	    
    private Map<Integer, List<Integer>> adjacencyList;
 
    public GraphLinkedList(int v)
    {
        adjacencyList = new HashMap<Integer, List<Integer>>();
        for (int i = 1; i <= v; i++)
            adjacencyList.put(i, new LinkedList<Integer>());
    }
    
    
    
 
    public void setEdge(int from, int to)
    {
        if (to > adjacencyList.size() || from > adjacencyList.size())
            System.out.println("The vertices does not exists");
    
        List<Integer> dls = adjacencyList.get(from);
        dls.add(to);
    }
 
    public List<Integer> getEdge(int to)
    {
        if (to > adjacencyList.size())
        {
            System.out.println("The vertices does not exists");
            return null;
        }
        return adjacencyList.get(to);
    }
    
    
 
    public boolean checkDAG()
    {
        Integer count = 0;
        Iterator<Integer> iteratorI = this.adjacencyList.keySet().iterator();
        Integer size = this.adjacencyList.size() - 1;
        while (iteratorI.hasNext())
        {
            Integer i = iteratorI.next();
            List<Integer> adjList = this.adjacencyList.get(i);
            if (count == size)
            {
                return true;
            }
            if (adjList.size() == 0)
            {
                count++;
                System.out.println("Target Node - " + i);
                Iterator<Integer> iteratorJ = this.adjacencyList.keySet()
                        .iterator();
                while (iteratorJ.hasNext())
                {
                    Integer j = iteratorJ.next();
                    List<Integer> li = this.adjacencyList.get(j);
                    if (li.contains(i))
                    {
                        li.remove(i);
                        System.out.println("Deleting edge between target node "
                                + i + " - " + j + " ");
                    }
                }
                this.adjacencyList.remove(i);
                iteratorI = this.adjacencyList.keySet().iterator();
            }
        }
        return false;
    }

    //DFS traversal from a given node to a target node. Returned as a list of nodes
    private List<Integer> DFS(int from, int to, List<Integer> list, Stack<Integer> stack)
    {
        stack.push(from);
        for (int i = 0;  i < adjacencyList.size(); i++) 
        {
            if (i == to) 
            {
                list.addAll(stack);
                return list;
            }
            DFS(i, to, list, stack);
        }
        stack.pop();
        return list;
    }
}

