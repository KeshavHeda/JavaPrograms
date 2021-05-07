package InnerClassIntroduction;

public class ButtonLocal {

    private String title;
    private OnClickListener onClickListener;

    public ButtonLocal(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public interface OnClickListener {
        void onClick(String title);
    }

    public void onClick() {
        this.onClickListener.onClick(this.getTitle());
    }

}
