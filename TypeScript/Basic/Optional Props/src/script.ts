function userInfo(user: 
    { name: string; age: number; email: string }
) {
    return `Name: ${user.name}, Age: ${user.age}, Email: ${user.email}`;
}

let user = {
    name: "ppfuark",
    age: 18,
    email: "ppfuark@example.com"
};

console.log(userInfo(user));