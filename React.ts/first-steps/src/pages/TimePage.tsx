import { useEffect, useState } from "react";

export default function TimePage(){

    const [currentTime, setCurrentTime] = useState(new Date);

    useEffect(()=>{
        const intervalId = setInterval(()=>{
            setCurrentTime(new Date);
        }, 1000)
        return () => clearInterval(intervalId);
    }, []);



    return(
        <div>
            <p>{currentTime.toLocaleTimeString()}</p>
        </div>
    );
}