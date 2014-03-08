package org.ichack.glassmove.cards;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.glass.app.Card;
import com.google.android.glass.widget.CardScrollAdapter;
import com.google.android.glass.widget.CardScrollView;

public class CardScrollActivity extends Activity {

	private List<Card> properties;
	private CardScrollView pCardScrollView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		createCards();
		
		pCardScrollView = new CardScrollView(this);
		PropertyCardScrollAdapter adapter = new PropertyCardScrollAdapter();
		pCardScrollView.setAdapter(adapter);
		pCardScrollView.activate();
		setContentView(pCardScrollView);
	}
	
	private void createCards() {
		properties = new ArrayList<Card>();
		
		Card house1 = new Card(this);
		house1.setText("First house");
		house1.setFootnote("Footer");
		properties.add(house1);
		
		Card house2 = new Card(this);
		house2.setText("House2");
		house2.setImageLayout(Card.ImageLayout.LEFT);
		//house2.addImage(uri)
		properties.add(house2);
	}
	
	private class PropertyCardScrollAdapter extends CardScrollAdapter {
		
		@Override
        public int findIdPosition(Object id) {
            return -1;
        }

        @Override
        public int findItemPosition(Object item) {
            return properties.indexOf(item);
        }

        @Override
        public int getCount() {
            return properties.size();
        }

        @Override
        public Object getItem(int position) {
            return properties.get(position);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return properties.get(position).toView();
        }
		
	}
	
	
}
