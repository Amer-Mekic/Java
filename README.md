# Java-DS
Implementation of Stack ADT using Liked List in LinkedStack, and Array in ArrayStack.

Both implementations use generics and implement "StackInterface2.java", with methods: push, pop, peek, isEmpty and clear.

LinkedStack implementation uses specialized private class "Node" that holds data of current node and a link to the next node.

ArrayStack, more concerned about capacity, contains also methods to ensure available capacity if expansion is needed, or to throw an exception when the MAX_CAPACITY is exceeded.
