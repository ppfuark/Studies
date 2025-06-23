function calcular(): void {
  const num1 = parseFloat((<HTMLInputElement>document.getElementById("num1")).value);
  const num2 = parseFloat((<HTMLInputElement>document.getElementById("num2")).value);
  const operation = (<HTMLSelectElement>document.getElementById("operation")).value;
  const resultDiv = document.getElementById("result");

  if (isNaN(num1) || isNaN(num2)) {
    resultDiv!.innerText = "Por favor, insira dois números válidos.";
    return;
  }

  let result: number | string;

  switch (operation) {
    case "add":
      result = num1 + num2;
      break;
    case "subtract":
      result = num1 - num2;
      break;
    case "multiply":
      result = num1 * num2;
      break;
    case "divide":
      result = num2 !== 0 ? num1 / num2 : "Não é possível dividir por zero.";
      break;
    default:
      result = "Operação inválida.";
  }

  resultDiv!.innerText = "Resultado: " + result;
}

document.getElementById("calculateBtn")?.addEventListener("click", calcular);
