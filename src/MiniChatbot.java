import java.util.Scanner;

public class MiniChatbot {

    private String name;

    public MiniChatbot() {
        this.name = "MiniChatbot";
    }

    public String greet() {
        return "Olá! Como posso ajudar?";
    }

    public String respondToNameQuery() {
        return "Eu sou o " + name + ", seu assistente virtual!";
    }

    public String respondToHowAreYou() {
        return "Estou funcionando perfeitamente, obrigado!";
    }

    public String defaultResponse() {
        return "Desculpe, não entendi sua pergunta. Pode reformular?";
    }

    public String handleInput(String userInput) {
        userInput = userInput.toLowerCase();

        if (userInput.contains("oi") || userInput.contains("olá")) {
            return greet();
        } else if (userInput.contains("qual é o seu nome")) {
            return respondToNameQuery();
        } else if (userInput.contains("como você está")) {
            return respondToHowAreYou();
        } else if (userInput.contains("sair")) {
            return "Tchau! Até a próxima.";
        } else {
            return defaultResponse();
        }
    }

    public static void main(String[] args) {
        MiniChatbot chatbot = new MiniChatbot();
        Scanner scanner = new Scanner(System.in);

        System.out.println(chatbot.greet());

        while (true) {
            System.out.print("Usuário: ");
            String userInput = scanner.nextLine();
            String response = chatbot.handleInput(userInput);
            System.out.println("MiniChatbot: " + response);
            if (userInput.toLowerCase().contains("sair")) {
                break;
            }
        }

        scanner.close();
    }
}
