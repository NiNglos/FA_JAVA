public class FilmClient extends Application {

    private TableView<Film> table;
    private RestClient restClient;

    @Override
    public void start(Stage primaryStage) throws Exception {
        restClient = new RestClient();

        table = new TableView<>();
        table.setEditable(true);

        TableColumn<Film, Integer> idCol = new TableColumn<>("ID");
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Film, String> nameCol = new TableColumn<>("Name");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Film, String> genreCol = new TableColumn<>("Genre");
        genreCol.setCellValueFactory(new PropertyValueFactory<>("genre"));

        TableColumn<Film, Integer> durationCol = new TableColumn<>("Duration");
        durationCol.setCellValueFactory(new PropertyValueFactory<>("duration"));

        TableColumn<Film, Integer> yearCol = new TableColumn<>("Year");
        yearCol.setCellValueFactory(new PropertyValueFactory<>("year"));

        table.getColumns().addAll(idCol, nameCol, genreCol, durationCol, yearCol);

        // get films from server and add to table
        List<Film> films = restClient.getFilms();
        table.getItems().addAll(films);

        Scene scene = new Scene(table);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}