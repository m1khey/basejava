package model;

public enum ContactType {

    PHONE("Тел."),
    MOBILE("Мобильный"),
    HOME_PHONE("Домашний тел."),
    SKYPE("Skype"),
    MAIL("Почта"),
    LINKEDIL("Профиль  LinkedIn"),
    GITHUB("Профиль  GitHub"),
    STACKOVERFLOW("Профиль  StackOverFlow"),
    HOME_PAGE("Домашняя страница");

    private final String title;

    ContactType(String title) {
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
}
