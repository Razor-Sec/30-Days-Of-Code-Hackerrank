package main
import "fmt"

func main() {
 //Enter your code here. Read input from STDIN. Print output to STDOUT
 var n int
    m := make(map[string]int)
   // make map to store scanned data
    fmt.Scan(&n)
    //Scan test data
    var name string
    var number int
    for i := 0; i < n; i++ {
        fmt.Scan(&name)
        fmt.Scan(&number)
        m[name] = number
    }
    //Query for values
    var query string
    for {
        _, err := fmt.Scanf("%s", &query)
        if err != nil {
            break
        }
        if value, ok := m[query]; ok {
            fmt.Printf("%s=%d\n", query, value)
        } else {
            fmt.Println("Not found")
        }
    }
}