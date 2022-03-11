package com.epam.autotasks.collections;

import java.util.*;

class MedianQueue<Integer extends Comparable<Integer>> extends AbstractQueue<Integer> {

    Queue<Integer> queue = new ArrayDeque<>();

    public void QueueMedium(Queue<Integer> queue){

        Queue<Integer> startQ = new PriorityQueue<>();
        while (!queue.isEmpty()){
            startQ.offer(queue.poll());
        }
//        System.out.println("\nstartQ:");
//        startQ.forEach(System.out::println);

        PriorityQueue<Integer> sortedQueue = new PriorityQueue<>();
        while (!startQ.isEmpty()){
            sortedQueue.offer(startQ.poll());
        }
//        System.out.println("\nsorted:");
//        sortedQueue.forEach(System.out::println);

        Deque<Integer> first = new ArrayDeque<>();
        Queue<Integer> second = new PriorityQueue<>();
        int next;
        int size = sortedQueue.size();
        if (size % 2 == 0){
            for (int i = 0; i < size / 2; i++){
                first.push(sortedQueue.poll());
            }
            next = size / 2;
        }
        else{
            for (int i = 0; i < size / 2 + 1; i++){
                first.push(sortedQueue.poll());
            }
            next = size / 2 + 1;
        }

        for (int i = next; i < size; i++){
            second.offer(sortedQueue.poll());
        }

//        System.out.println("\nfirst:");
//        first.forEach(System.out::println);
//        System.out.println("\nsecond:");
//        second.forEach(System.out::println);

        if (size % 2 != 0){
            queue.offer(first.poll());
        }

        while (!first.isEmpty() || !second.isEmpty()){
            Integer elem1 = first.poll();
            if (elem1 != null){
                queue.offer(elem1);
            }
            Integer elem2 = second.poll();
            if (elem2 != null){
                queue.offer(elem2);
            }
        }
//        System.out.println("\nqueue:");
//        queue.forEach(System.out::println);

    }



    @Override
    public Iterator<Integer> iterator() {
        return queue.iterator();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean offer(final Integer e) {
        return queue.offer(e);
    }

    @Override
    public Integer poll() {
        return queue.poll();
    }

    @Override
    public Integer peek() {
        QueueMedium(queue);
        return queue.peek();
    }

}

