/*
A Stack is a data structure that follows LIFO (Last In, First Out) principle it same a cup
Syntax
- push
- pop(Xóa và lấy phần tử trên cùng)
- peek(Xem phần tử trên cùng)
- isEmpty
- size
- clear
- search(Tìm kiếm phần tử trong stack)
- toString
- clone
- equals
- hashCode
- iterator
- listIterator
- spliterator
- stream
- parallelStream
- forEach
- removeIf
- retainAll
- removeAll
- addAll
- containsAll
- toArray
- toArray(T[] a)
- add(E e)
- remove(Object o)
- contains(Object o)
- iterator()
- listIterator()
- spliterator()
- stream()
- parallelStream()
- forEach(Consumer<? super E> action)
- removeIf(Predicate<? super E> filter)
- retainAll(Collection<?> c)
- removeAll(Collection<?> c)
- clear()
- equals(Object o)
- hashCode()
- toString()
- clone()
*/
class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){

            char c = s.charAt(i);
            if(c == '*') stack.pop();
            else stack.push(c);
            
        }
        // pop + Stringbuilder
        StringBuilder sb = new StringBuilder();
        
       for(char c : stack) sb.append(c);
        return sb.toString();
    }
}