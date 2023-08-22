//JSON

//Number
//숫자 나타내는 모든 자료형
//정수 ,실수 , 무한대, 숫자아님
//정수
const length=5
const size = 10
//실수
const temperature =36.5
const distance = 3.5
const floatPoint = 2.998e8

//무한대
const infinite = Infinity
const infNegative = Infinity

//Not a  Number  (NaN)
//숫자가 포함되어야하는 계산 또는 함수 결과 숫자가 아닐때
const parseFail = parseInt('a')
const sqrtNegative = Math.sqrt(-1)
const calculateNaN = 7+NaN

//String
//따옴표, 쌍따옴표  둘다 문자열
const single = 'Hello JS'
const double = "Hello JS"
const cannot = single + double
const paragraph = 'this/nis/nnewline'
console.log(paragraph)

//Backtick(`)사용 Templete Literal 생성가능
const name = 'Hyejin'
const message = `Hello ,${name}
Welcome to JS `
console.log(message)

//Boolean
//참 거짓
const isNumber =true
const isString = false

//null & undefined
//null
//어떤 데이터가 의도적으로 비어졌을경우 사용하는 데이터
let answer =null;
console.log(answer)

//undefined
//값이 정의되지 않을때 암시적으로 데이터가 비어버릴때
let answerNotDefined
console.log(answerNotDefined)
//둘이 공존하는건 설계 오류

console.log(typeof null)
console.log(typeof undefined)

//object
//JSON의 object 를 부르는 말과 동일
const person = {
firstName : 'Hyejon',
    lastName : 'park',
    'phone Number' : '010-0000-0000',
}
//객체 요소 접근시  `.` ,`[]`사용
console.log(person.firstName)

console.log(person.lastName)
console.log(person['lastName'])
console.log(person['phone number'])


// Array
// 순서가 보장되는 배열
// 각 요소를 `,` 기준으로 분리해서 정의
const numbers = [1, 2, 3, 4, 5]
console.log(numbers[0])
console.log(numbers[2])
console.log(numbers[numbers.length - 1])













