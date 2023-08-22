
//object Map과 유사
//Map.entrySet ->Map.Entry(key:Value)
const person = {
    firstName : 'Hyejon',
    lastName : 'park',
    'phone Number' : '010-0000-0000',
}
//for ... in
//객체 키 기준으로 순회
for(const key in person){
    console.log(key)
    console.log(person[key])
}



const numbers = [10, 20, 30]