//변수 선언
//let, const,var


//데이터 형식 따지지 않는 변수
let foo = ' a let variable'
//let 으로 선언한 변수는 재할당 가능
foo= 'let variable can be reallocation'
console.log(foo)
//다른 타입 재할당 가능하나 권장 x
foo =10
console.log(foo)


//const
//불변 변수
const bar = 'a const variable'
console.log(bar)
//const 선언 변수 재할당 x
//java final 과 비슷
//bar = 'const variable cannot be reallocation' //error
//상수 선언시 많이 활용
const PI =3.14



//var
//let 과 유사 동작
var baz = 'a var variable'
console.log(baz)
baz = ' var can be assigned again'

//호이스(hoisting)
console.log(notHoisted) //error
let notHoisted = 'let variable is not hoisted'

//아래쪽 선언한 변수들을 코드 최상단에서 우선 선언 하도록
//코드가 변경되어 ,실제 값 할당 이전에 참조가 가능해지는 현
console.log(hoisted)
var hoisted= 'var variable is hoisted'

//hoisting 논리적 흐름 깨트리기 때문에 더이상 권장되지 x
