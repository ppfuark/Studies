import { useEffect, useState } from "react";

export default function TimePage(){

    const [currentTime, setCurrentTime] = useState(new Date);
    const [hour, SetHour] = useState(new Date().getHours())

    let content = "";

    if (hour >= 0 || hour < 12 ){
        content = "Good Morning"
    } else if ( hour >= 12 || hour < 18){
        content = "Good Afthernoon"
    }else{
        content = "Good Night"
    }

    useEffect(()=>{
        const intervalId = setInterval(()=>{
            setCurrentTime(new Date);
            SetHour(new Date().getHours())
        }, 1000)
        return () => clearInterval(intervalId);
    }, []);

    return(
        <div className="bg-violet-500 flex flex-col h-screen w-screen items-center justify-center">
            <p className="text-white text-7xl font-bold">{content}</p>
            <p className="text-white text-5xl font-bold">{currentTime.toLocaleTimeString()}</p>
        </div>
    );
}