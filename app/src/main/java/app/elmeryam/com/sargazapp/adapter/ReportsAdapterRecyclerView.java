package app.elmeryam.com.sargazapp.adapter;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import app.elmeryam.com.sargazapp.R;
import app.elmeryam.com.sargazapp.model.Report;

public class ReportsAdapterRecyclerView extends RecyclerView.Adapter<ReportsAdapterRecyclerView.ReportsViewHolder>{

    private ArrayList<Report> reports;
    private int resource;

    public ReportsAdapterRecyclerView(ArrayList<Report> reports, int resource) {
        this.reports = reports;
        this.resource = resource;
    }

    @NonNull
    @Override
    public ReportsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_reports,null,false);
        return new ReportsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReportsViewHolder holder, int position) {
        Report report = this.reports.get(position);
        holder.nameBeach.setText(report.getName());
        holder.description.setText(report.getDescription());
        holder.status.setText(report.getStatus());
        holder.date.setText(report.getDate());
        holder.time.setText(report.getTime());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ReportsViewHolder extends RecyclerView.ViewHolder{

        private ImageView pictureCard;
        private TextView nameBeach;
        private TextView description;
        private TextView status;
        private TextView date;
        private TextView time;

        public ReportsViewHolder(View itemView){
            super(itemView);

            pictureCard = (ImageView) itemView.findViewById(R.id.imageView);
            nameBeach = (TextView) itemView.findViewById(R.id.nomPlaya);
            description = (TextView) itemView.findViewById(R.id.description);
            status = (TextView) itemView.findViewById(R.id.estado);
            date = (TextView) itemView.findViewById(R.id.dateReport);
            time = (TextView) itemView.findViewById(R.id.timeCard);
        }
    }
}
