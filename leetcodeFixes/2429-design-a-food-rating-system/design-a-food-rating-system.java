class FoodRatings {
    private Map<String, Integer> foodToRating;
    private Map<String, String> foodToCuisine;
    private Map<String, PriorityQueue<Food>> cuisineToHeap;

    private static class Food {
        int rating;
        String name;

        Food(int rating, String name) {
            this.rating = rating;
            this.name = name;
        }
    }

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodToRating = new HashMap<>();
        foodToCuisine = new HashMap<>();
        cuisineToHeap = new HashMap<>();

        for (int i = 0; i < foods.length; i++) {
            foodToRating.put(foods[i], ratings[i]);
            foodToCuisine.put(foods[i], cuisines[i]);
            cuisineToHeap
                .computeIfAbsent(cuisines[i], k -> new PriorityQueue<>(
                    (a, b) -> a.rating == b.rating ? a.name.compareTo(b.name) : b.rating - a.rating))
                .offer(new Food(ratings[i], foods[i]));
        }
    }
    
    public void changeRating(String food, int newRating) {
        String cuisine = foodToCuisine.get(food);
        foodToRating.put(food, newRating);
        cuisineToHeap.get(cuisine).offer(new Food(newRating, food));
    }

    public String highestRated(String cuisine) {
        PriorityQueue<Food> heap = cuisineToHeap.get(cuisine);
        while (!heap.isEmpty()) {
            Food top = heap.peek();
            if (foodToRating.get(top.name) == top.rating) {
                return top.name;
            }
            heap.poll(); 
    }
    return "";
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */