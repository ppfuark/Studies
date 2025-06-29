function userInfoWithOptionalProps(user: 
    { name: string; age: number; email: string }
) {
    if (user.email !== undefined) {
        return `Name: ${user.name}, Age: ${user.age}, Email: ${user.email}`;
    } else {
        return `Name: ${user.name}, Age: ${user.age}`;
    }
}

let userWithOptionalProps = {
    name: "ppfuark",
    age: 18,
    email: "ppfuark@example.com"
};

console.log(userInfoWithOptionalProps(userWithOptionalProps));