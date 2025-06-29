// type UserInfoWithCreatedType = {
//     name: string;
//     age: number;
//     email?: string; // Optional property
// };

interface UserInfoWithCreatedType {
    name: string;
};

interface UserInfoWithCreatedType {
    age: number;
    email?: string; // Optional property
};

let userWithCreatedType: UserInfoWithCreatedType = {
    name: "ppfuark",
    age: 18,
};

let userWithCreatedType1: UserInfoWithCreatedType = {
    name: "ppfuark",
    age: 18,
    email: "ppfuark@example.com"
};
