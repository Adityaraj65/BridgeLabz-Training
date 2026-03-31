package stackAndQueue;

import java.util.ArrayDeque;
import java.util.Queue;

class CircularTourProblem{

    static class PetrolPump {
        int petrol;
        int distance;

        PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }

    public static int findStartingPoint(PetrolPump[] pumps) {

        Queue<PetrolPump> queue = new ArrayDeque<>();

        int start = 0;
        int currentPetrol = 0;
        int i = 0;

        while (queue.size() != pumps.length) {

            // Add current pump to queue
            queue.add(pumps[i]);
            currentPetrol += pumps[i].petrol - pumps[i].distance;

            // If petrol becomes negative, remove pumps from front
            while (currentPetrol < 0 && !queue.isEmpty()) {

                PetrolPump removed = queue.poll();
                currentPetrol -= (removed.petrol - removed.distance);
                start++;

                // If start exceeds length, no solution
                if (start >= pumps.length) {
                    return -1;
                }
            }

            i = (i + 1) % pumps.length;
        }

        return start;
    }

    public static void main(String[] args) {

        PetrolPump[] pumps = {
                new PetrolPump(6, 4),
                new PetrolPump(3, 6),
                new PetrolPump(7, 3)
        };

        System.out.println(findStartingPoint(pumps));
    }
}

