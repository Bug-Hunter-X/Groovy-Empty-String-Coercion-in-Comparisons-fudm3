```groovy
def myMethod(String str) {
  if (str == null) {
    return "Null String"
  }
  return str.toUpperCase()
}

println myMethod(null) // Output: Null String
println myMethod("")   // Output: 
```