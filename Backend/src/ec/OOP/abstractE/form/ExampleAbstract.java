package ec.OOP.abstractE.form;

import ec.OOP.abstractE.form.elementos.ElementForm;
import ec.OOP.abstractE.form.elementos.InputForm;
import ec.OOP.abstractE.form.elementos.LabelForm;
import ec.OOP.abstractE.form.elementos.SelectForm;
import ec.OOP.abstractE.form.elementos.TextareaForm;
import ec.OOP.abstractE.form.elementos.select.Option;
import ec.OOP.abstractE.form.elementos.validator.EmailValidator;
import ec.OOP.abstractE.form.elementos.validator.LengthValidator;
import ec.OOP.abstractE.form.elementos.validator.NoNullValidator;
import ec.OOP.abstractE.form.elementos.validator.RequestedValidator;

import java.util.Arrays;
import java.util.List;

public class ExampleAbstract {
    public static void main(String[] args) {
        //Clase Ananimo o al vuelo

        ElementForm great = new ElementForm() {
            @Override
            public String drawHtml() {
                return "<input disable name=\"" + this.nameHtml + "\" value=\"" + this.valueHtml + "\" >";
            }
        };
        great.setValueHtml("Hello World");
        great.setId("great");
        InputForm username = new InputForm("username");
        username.setId("username");
        username.addValidator(new RequestedValidator());
        InputForm password = new InputForm("password", "password");
        password.setId("password");
        password.addValidator(new RequestedValidator())
                .addValidator(new LengthValidator(15,6));

        InputForm email = new InputForm("email", "email");
        email.setId("email");
        email.addValidator(new RequestedValidator())
                .addValidator(new EmailValidator());
        InputForm age = new InputForm("age", "number");
        age.setId("age");
        age.addValidator(new RequestedValidator())
                .addValidator(new NoNullValidator());


        TextareaForm experience = new TextareaForm("experience", 5, 9);
        experience.setId("experience");

        experience.addValidator(new RequestedValidator());

        SelectForm language = new SelectForm("language");
        language.setId("language");
        language.addValidator(new NoNullValidator());
        Option java = new Option("Java", false, "1");
        Option python = new Option("Python", false, "2");
        Option php = new Option("PHP", false, "3");
        Option javaScript = new Option("JavaScript", false, "4");
        language.addOption(java)
                .addOption(python)
                .addOption(php.setSelected())
                .addOption(javaScript);


        username.setValueHtml("llerenaP");
        password.setValueHtml("llerenaP5515");
        email.setValueHtml("llerenaP@gmail.com");
        age.setValueHtml("24");
        experience.setValueHtml("Developer for two years working in a lot of projects");


        LabelForm usernameLabel = new LabelForm("Username", "username", "Enter your username", "font-weight: bold;");
        LabelForm passwordLabel = new LabelForm("Password", "password", "Enter your password", "font-weight: bold;");
        LabelForm emailLabel = new LabelForm("Email", "email", "Enter your email", "font-weight: bold;");
        LabelForm ageLabel = new LabelForm("Age", "age", "Enter your age", "font-weight: bold;");
        LabelForm experienceLabel = new LabelForm("Experience", "experience", "Describe your experience", "font-weight: bold;");
        LabelForm languageLabel = new LabelForm("Language", "language", "Select your preferred language", "font-weight: bold;");
        LabelForm grateLabel = new LabelForm("Hello World" , "grate", "Greate", "font-weight: bold;");

        List<ElementForm> elementForms = Arrays.asList(
                usernameLabel, username,
                passwordLabel, password,
                emailLabel, email,
                ageLabel, age,
                experienceLabel, experience,
                languageLabel, language ,
                grateLabel, great
        );


        elementForms.forEach(form -> System.out.println(form.drawHtml()));
        elementForms.forEach(element -> {
            if (!element.isValid()){
                element.getErrors().forEach(System.out::println);
            }
        });
    }
}
