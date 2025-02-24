```groovy
def myMethod(String str) {
  if (str == null || str.isEmpty()) {
    return "Empty or Null String"
  }
  return str.toUpperCase()
}

println myMethod(null) // Output: Empty or Null String
println myMethod("")   // Output: Empty or Null String
println myMethod("hello") // Output: HELLO
```