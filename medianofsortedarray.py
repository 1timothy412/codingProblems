import random
def sort_array(nums1):
    min = nums1[0];
    sorted_nums = [];
    # Find min
    for item in nums1:
        if item < min:
            min = item;
    print (min);

# Create while loop i
i = 1;
# Create median index var
median_index = 0;
# Create empty array to hold
nums1 = [];
# How many numbers in an array
array_item = int(input('How many numbers in your array?'))
# Generate random integer numbers
while i <= array_item:
    nums1.append(random.randint(1,100));
    i=i+1;
print (nums1);
nums1.sort();
print (nums1);
# Find median if the array is odd
if array_item % 2 == 1:
    median_index = int(array_item/2)+1
    print (f'The median is   {nums1[median_index-1]}');
# Find median if the array is even
else:
    median_index = int(array_item/2)
    print (f'The median is   {(nums1[median_index-1]+nums1[median_index])/2}');




