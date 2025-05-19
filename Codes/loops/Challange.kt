fun main(){
	cal(10)
}

fun cal(n : Int){
	var count = 0
	for(i in 0..n){
		if(i % 2 == 0){
			print("$i\t")
			count++
		}
	}
}
